public class BalanceInsufficientException extends Exception{
    public BalanceInsufficientException() {}    //기본 생성자

    public BalanceInsufficientException(String message) {
        super(message); //상속을 받았을때 부모클래스의 생성자 호출
    }
}
