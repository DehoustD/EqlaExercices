public class array_reduce {

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3};

        System.out.println(myIntArray.length); // test de la taille du tableau avant.

        myIntArray = ArrayReduce(myIntArray);

        System.out.println(myIntArray.length); // test de la taille du tableau après.
        
    }

    public static int[] ArrayReduce(int[] _intArray){

        int[] _newIntArray = new int[_intArray.length - 1];

        for (int i = 0; i < _newIntArray.length; i++) {

            _newIntArray[i] = _intArray[i];
            
        }

        return _newIntArray;

    }
    
}
