import java.util.Iterator;

public class StringtrimmerIterator implements Iterator<StringTrimmer>, StringtrimmerIteratorInterface{
 
    private StringTrimmer [] types;
    int pos;
     
    public StringtrimmerIterator(StringTrimmer []types){
        this.types = types;
    }
    @Override
    public boolean hasNext() {
        if(pos >= types.length || types[pos] == null)
            return false;
        return true;
    }
 
    @Override
    public StringTrimmer next() {
        return types[pos++];
    }
 
    @Override
    public void remove() {
        if(pos <=0 )
            throw new IllegalStateException("Illegal position");
        if(types[pos-1] !=null){
            for (int i= pos-1; i<(types.length-1);i++){
            	types[i] = types[i+1];
            }
            types[types.length-1] = null;
        }
    }
}