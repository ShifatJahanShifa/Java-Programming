public class ReadTextFileTest {
    public static void main(String[] args) {
        ReadTextFile readTextFile=new ReadTextFile();
        readTextFile.openFile();
        readTextFile.readRecords();
        readTextFile.closeFile();
    }
}
