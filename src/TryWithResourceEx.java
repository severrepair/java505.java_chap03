public class TryWithResourceEx {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")){
            fis.read();
            throw new Exception();  //예외 강제 발생
        }
        catch (Exception e){
            System.out.println("예외처리 코드가 실행되었습니다.");
        }

    }
}
