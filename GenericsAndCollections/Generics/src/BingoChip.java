public class BingoChip<R,C>{
    public R row;
    public C col;

    public BingoChip(R Row, C Col){
        this.row = Row;
        this.col = Col;
    }

    public String toString(){
        return "Chip:" + col.toString() + "-"+row.toString();
    }
}/* TODO
Implement this class.
Use the instructions and check how it is used in Task.java*/

