import javax.sound.midi.Track;
import java.io.IOException;
import java.nio.*;
import java.nio.file.*;
import java.util.*;

/**
 * Created by blinky on 23.02.15.
 */

public class Duplicating {

    private static ArrayList<Path>

            pathList = new ArrayList<>();

    public static void main(String[] args) {
        Path currentDir = Paths.get("/root");
        findFiles(currentDir);
        Collections.sort(pathList, new PathComparatorBySize() );
        processList();
    }

    private static void processList() {

        Path prevPath = null;
        for( Path path : pathList ) {

            try {

                if( prevPath != null && Files.size( prevPath ) == Files.size( path ) ) {

                } else {
                    System.out.print(path.getFileName() + ", ");
                }
            }
            catch( IOException e ) {
                e.printStackTrace();
            }
            prevPath = path;
        }
    }

    public static void findFiles(Path dir) {
        try {
            final DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
            for(Path entry : stream){

                if(Files.isDirectory(entry)){
                    findFiles(entry);
                } else {
                    pathList.add( entry );

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final boolean isDuplicated(final Path first, final Path second){
        try {
            return Files.size(first) == Files.size(second) &&
                    Arrays.equals(Files.readAllBytes(first), Files.readAllBytes(second));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;

    }

    private static class PathComparatorBySize
            implements Comparator<Path> {

        @Override
        public int compare( Path o1, Path o2 ) {

            long size1 = 0;
            long size2 = 0;
            try {
                size1 = Files.size( o1 );
                size2 = Files.size( o2 );
            }
            catch( IOException e ) {

                e.printStackTrace();
            }
            if( size1 < size2 )
                return -1;
            if( size1 > size2 )
                return 1;
            return 0;
        }
    }
}