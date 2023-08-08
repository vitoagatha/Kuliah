
import static java.lang.System.in;

public class AplikasiTodolist {

    public static String[] model = new String[10];
    public static java.util.Scanner in = new java.util.Scanner(System.in);

    public static void main(String[] args) {

      viewShowTodolist();

    }

    public static void showTodolist(){ // menampilkan
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var nomor = i + 1;

            if (todo != null){
                System.out.println(nomor + ". " + todo);
            }

        }
    }

    public static void testShowTodolist(){
        model[0] = "Belajar java";
        model[1] = "Belajar python";
        model[2] = "Belajar php";
        showTodolist();
    }

    public static void addTodolist(String todo){ // menambah
        // cek jika data model penuh atau tidak
        var penuh = true;
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){ // model masih kosong
                penuh = false; // jika data kosong maka false
                break;
            }
        }
        // jika penuh, kita resize array nya
        if (penuh){
            var temp = model; // menyimpan data lama
            model = new String[model.length * 2]; // data model di kali 2, jadi data baru

            for (var i = 0; i < temp.length; i++){
                model[i] = temp[i]; // mengembalikan data sementara yang tadi
            }
        }


        // tambahkan ke data yang array nya null
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodolist(){
        for (var i = 0; i < 25; i++){ // test untuk addtodolist jika lebih
            addTodolist("Contoh todo ke " + i);
        }
        showTodolist();
    }

    public static boolean removeTodolist(Integer number){ // menghapus, ini integer object menghapus object saja
        // boolean untuk mengetahui benar atau salah
        if ((number - 1) >= model.length){ // cek jika number input melebihi array
            return false;
        } else if (model[number - 1 ] == null){
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++){
                if (i == (model.length - 1)){ // jika data sudah habis maka null
                    model[i] = null;
                } else {
                    model[i] = model[i + 1]; // jika data di ujung maka geser ke indexs selanjutnya
                }
            }
            return true;
        }
    }

    public static void testRemoveTodolist(){
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");

        var result = removeTodolist(20); // false
        System.out.println(result);

        result = removeTodolist(7); // false
        System.out.println(result);
        result = removeTodolist(2);
        System.out.println(result);

        showTodolist();
    }

    public static String input(String info){
        System.out.print(info + ": ");
        String data = in.nextLine();
        return data;
    }

    public static void testInput(){
        var data = input("Nama");
        System.out.println("Hi " + data);
    }

    public static void viewShowTodolist(){
        while (true){
            showTodolist();

            System.out.println("MENU");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");
            if (input.equals("1")){
                viewAddTodolist();
            } else if (input.equals("2")){
                viewRemoveTodolist();
            } else if (input.equals("x")){
                break;
            } else {
                System.out.println("Pilihan tidak ada");
            }
        }
    }

    public static void testViewShowTodolist(){
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");

        viewShowTodolist();
    }

    public static void viewAddTodolist(){
        System.out.println("Tambahkan TODOLIST");

        var todo = input("Todo (tulis x jika batal)");
        if (todo.equals("x")){
            // batal
        } else {
            addTodolist(todo);
        }
    }

    public static void tesViewAddTodolist(){
        addTodolist("Satu");
        addTodolist("Dua");


        viewAddTodolist();

        showTodolist();
    }

    public static void viewRemoveTodolist(){
        System.out.println("Menghapus TODOLIST");

        var number = input("Nomor yang dihapus (tulis x jika batal)");

        if (number.equals("x")){
            // batal
        } else {
            boolean success = removeTodolist(Integer.valueOf(number)); //konversi ke int
            if (!success){
                System.out.println("Gagal menghapus todolist: " + number );
            }
        }
    }

    public static void testViewRemoveTodolist(){
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("tiga");

        showTodolist();

        viewRemoveTodolist();

        showTodolist();
    }
}
