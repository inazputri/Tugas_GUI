# Tugas_GUI
# Aplikasi Pencatat Film

## Deskripsi
Aplikasi Pencatat Film adalah aplikasi GUI sederhana berbasis Java Swing yang digunakan untuk mencatat daftar film. Pengguna dapat menambahkan judul film, memilih genre, memberikan rating, dan menghapus film dari daftar.

## Fitur
- Menambahkan film berdasarkan judul.
- Memilih genre film.
- Memberikan rating film dari 1 sampai 5.
- Menampilkan daftar film beserta genre dan rating.
- Menghapus film yang dipilih.
- Menampilkan informasi status aktivitas aplikasi.
- Memvalidasi agar judul film tidak kosong.

## Teknologi
- Bahasa pemrograman: Java
- Library GUI: Java Swing
- Layout Manager: BorderLayout dan GridLayout
- Event Handling: ActionListener dan ItemListener

## Komponen GUI

### 1. Top Level Container
- `JFrame`: Jendela utama aplikasi.

### 2. Intermediate Component
- `JPanel`: Mengelompokkan komponen input dan daftar film.
- `JScrollPane`: Menyediakan area gulir untuk daftar film.

### 3. Atomic Component
- `JLabel`: Menampilkan teks dan status.
- `JTextField`: Memasukkan judul film.
- `JComboBox`: Memilih genre dan rating film.
- `JButton`: Menambahkan dan menghapus film.
- `JList`: Menampilkan daftar film.

### 4. Layout Manager
- `BorderLayout`: Mengatur posisi panel input, daftar film, dan status.
- `GridLayout`: Menyusun komponen input dalam baris dan kolom.

### 5. Event Handling
Aplikasi menggunakan dua interface Java:
- `ActionListener`: Menangani klik tombol Tambah Film dan Hapus Film.
- `ItemListener`: Menangani perubahan pilihan genre dan rating.

## Cara Menjalankan
1. Pastikan Java Development Kit (JDK) sudah terinstal.
2. Simpan kode program dengan nama `PencatatFilm.java`.
3. Buka terminal pada folder tempat file disimpan.
4. Kompilasi program dengan perintah:

   ```bash
   javac PencatatFilm.java
   ```

5. Jalankan program dengan perintah:

   ```bash
   java PencatatFilm
   ```

Program GUI Pencatat Film akan terbuka dan siap digunakan.

## Cara Menggunakan
1. Masukkan judul film.
2. Pilih genre film.
3. Pilih rating dari 1 sampai 5.
4. Klik **Tambah Film** untuk menyimpan film ke daftar.
5. Pilih film pada daftar, kemudian klik **Hapus Film** jika ingin menghapusnya.

## Penyimpanan Data
Data film hanya disimpan sementara selama aplikasi berjalan. Data tidak disimpan ke database atau file, sehingga akan hilang ketika aplikasi ditutup.

6. Dokumentasi
   ## Tampilan Awal
   <img width="714" height="617" alt="image" src="https://github.com/user-attachments/assets/be80aed8-5307-43f2-a7d1-11d4bc27d656" />

   ## Tampilan Tambah film
   <img width="687" height="546" alt="image" src="https://github.com/user-attachments/assets/fc030122-5189-4245-afe0-c67f3c0e1201" />
   
   ## Tampilan Film Dihapus
   <img width="545" height="517" alt="image" src="https://github.com/user-attachments/assets/075bc391-f093-4739-b65d-3b9f8ca5edd6" />



