/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E31190648_Queue;

/**
 *
 * @author Faiz-Muazzam
 */
public class Queue {
    //Identifikasi Variabel
    int array[]=new int[5];//Panjang array adalah 5
    int ukuran;//Untuk menyimpan jumlah banyak data
    int depan;//digunakan untuk menyimpan nilai index array 
    int belakang;//digunakan untuk menyimpan nilai index array 
    
    //Membuat metode yang digunakan untuk menambahkan data
    public void enQueue(int data){
        //Membuat Kondisi jika array belum penuh dapat melakukan proses sebagai berikut
        if (!Penuh()) {
        array[belakang]=data;//menyimpan data yang di inputkan ke dalam array
        belakang=(belakang+1)%5;//untuk merubah variable belakang agar selalu bernilai ke angka selanjutnya
        //Bertujuan agar program dapat menambahkan data ke index berikutnya
        ukuran=ukuran+1;//selalu merubah nilai size setelah proses selesai bertujuan untuk mengecek queue penuh atau tidak
        }else{//Jika array sudah penuh maka akan menampilkan proses di bawah ini
            System.out.println("Keterangan : ");
            System.out.println("Queue is Full");
        }
    }
    
    //Membuat methot untuk menghapus data
    public int deQueue(){
        int data=array[depan];//karena int data belum ada nilai jadi data dengan nilai index depan akan kosong
        if (!Kosong()) {
             depan=(depan+1)%5;//untuk merubah variable depan agar selalu bernilai ke angka selanjutnya
             ukuran=ukuran-1;//selalu merubah nilai size setelah proses selesai bertujuan untuk mengecek queue  penuh atau tidak
             System.out.println("Data Yang Dihapus : ");
             System.out.println(data);//menampilkan datab yang di hapus
        }else{
            //Jika array sudah kosong maka akan melakukan proses berikut
            System.out.println("Keterangan : ");
            System.out.println("Queue is Empty");
        }
       
        
        return data;
    }
    
    //membuat method untuk menampilkan data
    public void show(){
        System.out.print("Data Queue : ");
        for (int i = 0; i < ukuran; i++) {
            System.out.print(array[(depan+i)%5]+" ");//Karena nial index depan dan belakang sudah berubah ubah maka agar data dapat di tampilkan maka harus menggunkan tidakan sebagai berikut
            
        }
        System.out.println("");
        System.out.println("Data Sebelumnya : ");
        
        for (int n : array) {
            System.out.print(n+" ");
        }
    }
    
    //Berfungsi untuk menyimpan setiap perubahan nilai variabel ukuran
    public int getUkuran(){
        return ukuran; 
    }
    
    //Berfungsi untuk identifikasi jika array sudah kosong
    public boolean Kosong(){
        return getUkuran()==0;
    } 
    
     //Berfungsi untuk identifikasi jika array sudah Penuh
    public boolean Penuh(){
        return getUkuran()==5;
    } 
    
}
