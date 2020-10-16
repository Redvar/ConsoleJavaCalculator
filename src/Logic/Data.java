package Logic;

public class Data {
    private int firstValue;
    private int secondValue;
    private String typeOperation;
    private boolean typeValueRomanian;

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public int getFirstValue() {
        return this.firstValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    public int getSecondValue() {
        return this.secondValue;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public String getTypeOperation() {
        return this.typeOperation;
    }

    public void setTypeValueRomanian(boolean typeValueRomanian) {
        this.typeValueRomanian = typeValueRomanian;
    }

    public boolean getTypeValueRomanian(){
        return this.typeValueRomanian;
    }
}
