/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyClass {

    public static int x = 10;

    private static void Show(MyClass obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int y = 5;

    public void Print() {
        System.out.println(x + "," + y);

    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.y = 100;
        obj.Print();
        MyClass.x = 200;
        MyClass.Show(obj);
    }
}
