
public class Droid {
  String name;
    int batteryLevel = 100;
  public Droid(String droidName) {
      name = droidName;

  }
  public String toString(){
    return "Hello, I’m the droid: "+name;
  }
  public void performtask(String task){
      System.out.println(name+ "id performing task:"+task);
  }
  public static void main(String args[]){
  Droid droida = new Droid("Codey");
  System.out.println(droida.name);
  }
}
