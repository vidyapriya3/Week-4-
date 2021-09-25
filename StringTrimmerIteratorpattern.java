public class StringTrimmerIteratorpattern {
 
    public static void main(String[] args) {
    	StringTrimmerTypesInterface types = new StringTrimmerTypes();
    	types.addStringtrimmer("Electric",1200);
    	types.addStringtrimmer("Gas-Powered",1000);
         
    	StringtrimmerIterator iterator = new StringtrimmerIterator(types.getStringTrimmers());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Removing last iterated type..");
        iterator = new StringtrimmerIterator(types.getStringTrimmers());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
 
}