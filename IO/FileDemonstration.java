import java.io.File;

public class FileDemonstration {
    public void analyzePath(String path)
    {
        File name=new File(path);

        if(name.exists())
        {
            System.out.println("file name : "+name.getName());
            System.out.println(name.isFile()? "is a file" : "not a file");
            System.out.println(name.isDirectory() ? "is a directory": "is not a directory");
            System.out.println(name.isAbsolute() ? "is an absolute path": "is not an absolute path");
            System.out.println("last modified : "+name.lastModified());
            System.out.println("file length : "+name.length());
            System.out.println("path : "+name.getPath());
            System.out.println("absolute path : "+name.getAbsolutePath());
            System.out.println("parent path : "+name.getParent());

            if (name.isDirectory())
            {
                String[] contents= name.list();

                for (String directoryName : contents) {
                    System.out.println(directoryName);
                }
            }
        }
        else
        {
            System.out.println(path+" does not exist");
        }
    }
}
