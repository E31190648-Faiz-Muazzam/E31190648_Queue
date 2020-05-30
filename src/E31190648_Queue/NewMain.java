/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E31190648_Queue;
import java.util.Scanner;//Memanggil class yang ada dalam java
/**
 *
 * @author Faiz-Muazzam
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Memanggil class queue
        Queue q=new Queue();
        //Identifikasi Variabel 
        int pilihan;
        int data;
        //melakukan looping 
        do{
            System.out.println("");
            System.out.println("");
            System.out.println("-----------------------Queue---------------------------");
            System.out.println("1. enQueue");
            System.out.println("2. deQueue");
            System.out.println("3. Show Data");
            System.out.println("0. Close");
            System.out.println("-------------------------------------------------------");
            System.out.println("Masukkan Pilihan : ");
            //memanggil scanner
            Scanner input=new Scanner(System.in);//membuat scanner dengan nama input
            pilihan=input.nextInt();//memanggil nama scanner
            
            //Buat kondisi untuk setiap inputan yang sesuai dengan keterangan 
            //kondisi jika memilih enqueue
            if (pilihan==1) {
                System.out.println("Masukkan Data yang ingin ditambahkan : ");
                data=input.nextInt();//menginput nilai yang di push
                q.enQueue(data);//memanggil method enQueue
                
            }else if(pilihan==2){//kondisi jika memilih deQueue
                System.out.println("---------------------------------------------------");
                System.out.println("Hasil : ");
                q.deQueue();//memanggil fungsi deQueue
            }else if (pilihan==3) {//kondisi jika memilih show data
                System.out.println("---------------------------------------------------");
                System.out.println("Hasil : ");
                System.out.println("Apakah Queue Sudah Penuh ?");
                System.out.println(q.Penuh());
                System.out.println("Size : "+q.getUkuran());//menampilkan ukuran queue
                q.show();//memanggil method show di kelas queue
            }else if (pilihan==0) {//kondisi k=jika memilih keluar
                System.exit(0);//memanggil method java untuk keluar system
            }else{//jika user menginput yang ti dak sesuai dengan keterangan
                System.out.println("Pilihan Tidak Ada");
            }
        }while(pilihan !=0);//berhenti ketika user memilih angka 0 atau keluar
    }        
}
