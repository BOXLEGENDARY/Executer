package backtraceio.library.models.json;

class AnnotationException {
    private Object message;

    AnnotationException(Object obj) {
        setMessage(obj);
    }

    void setMessage(Object obj) {
        this.message = obj;
    }
}
