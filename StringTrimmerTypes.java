public class StringTrimmerTypes implements StringTrimmerTypesInterface {
     
    private StringTrimmer []types = new StringTrimmer[5];
    private int index;
     
    @Override
	public void addStringtrimmer(String name,double price){
        int i = index++;
        types[i] = new StringTrimmer(i,name,price);
    }
     
    @Override
	public StringTrimmer[] getStringTrimmers(){
        return types;
    }
}