public class c5e5_testArray {
    public static void main(String[] args) {

        String[] myArray = {""};
        String newName = "";
        int index = 0;

        myArray[0] = prj_user.AskString("array index 0 = ?");

        while (prj_user.AskInt("continuer ? 1 = oui") == 1) {

            index++;

            //myArray[index] = prj_user.AskString("array index " + index + " = ?");

            newName = prj_user.AskString("array index " + index + " = ?");

            myArray = AddStringElement(myArray.length+1, myArray, newName);

        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

    }

    static String[] AddStringElement(int _n, String[] _theArray, String _name){

        int _index = 0;
        String[] _newArray = new String[_n + 1];

        for (_index = 0; _index < _n ; _index++) {
            _newArray[_index] = _theArray[_index];
        }
        _newArray[_n] = _name;

        return _newArray;
    }
}

// 