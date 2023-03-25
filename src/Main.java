
interface Ione{
    void model();
}

interface Itwo{
    void engine();
}

class Car implements Ione, Itwo{

    @Override
   public void model(){
        System.out.println("Honda");
    }

    public void engine(){
        System.out.println("this is car engine");
    }
}

class Main{
    public static void main(String[] args){
        Car obj = new Car();
        obj.model();
        obj.engine();
    }
}
