package backtraceio.library.models.types;

public class HttpException extends Exception {
    private Integer httpStatus;

    public HttpException(String str) {
        this(null, str);
    }

    private void setHttpStatus(int i7) {
        this.httpStatus = Integer.valueOf(i7);
    }

    public int getHttpStatus() {
        return this.httpStatus.intValue();
    }

    public HttpException(Integer num) {
        this(num, null);
    }

    public HttpException(Integer num, String str) {
        super(str);
        setHttpStatus(num.intValue());
    }
}
