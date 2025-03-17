public class DataTypes {

    public void primitiveDataTypes() {
        int a = 10;
        Short s = 4;
        Byte b = 2;
        Long l = 10100101L;
        float f = 2.3f;
        double d = 3.22;
        char c = 'a';
        boolean flag = true;

        System.out.println(a);
        System.out.println(s);
        System.out.println(b);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(flag);

    }

    public void referenceDataTypes() {

        String name = "Ahmed";
        int [] nums = {1, 2, 3, 4, 5};

        System.out.println(name);
        System.out.println(nums.length);
    }

    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();
        dataTypes.primitiveDataTypes();
        dataTypes.referenceDataTypes();
    }
}
