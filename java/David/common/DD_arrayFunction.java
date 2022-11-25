package common;

public class DD_arrayFunction {

    public static void ShowArrayString (String[] _array){

        for (int i = 0; i < _array.length; i++) {
            
            System.out.println(_array[i]);
    
        }
    
    }

    public static void ShowArrayInt (int[] _array){

        for (int i = 0; i < _array.length; i++) {
            
            System.out.println(_array[i]);
    
        }
    
    }

    public static void ShowArrayFloat (float[] _array){

        for (int i = 0; i < _array.length; i++) {
            
            System.out.println(_array[i]);
    
        }
    
    }
    

    public static String[] ArrayAddString(String[] _array, String _NewValue){

        String[] _newArray = new String[_array.length + 1];

        if (_array.length > 0) {

            for (int i = 0; i < _newArray.length - 1; i++) {

                _newArray[i] = _array[i];
                
            }
            
        }

        _newArray[_newArray.length - 1] = _NewValue;

        return _newArray;
    }

    public static int[] ArrayAddInt(int[] _array, int _NewValue){

        int[] _newArray = new int[_array.length + 1];

        if (_array.length > 0) {

            for (int i = 0; i < _newArray.length - 1; i++) {

                _newArray[i] = _array[i];
                
            }
            
        }

        _newArray[_newArray.length - 1] = _NewValue;

        return _newArray;

    }

    public static float[] ArrayAddFloat(float[] _array, float _NewValue){

        float[] _newArray = new float[_array.length + 1];

        if (_array.length > 0) {

            for (int i = 0; i < _newArray.length - 1; i++) {

                _newArray[i] = _array[i];
                
            }
            
        }

        _newArray[_newArray.length - 1] = _NewValue;

        return _newArray;
        
    }

}