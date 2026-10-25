
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PencatatFilm extends JFrame
        implements ActionListener, ItemListener {

    JTextField txtJudul;
    JComboBox<String> cmbGenre;
    JComboBox<Integer> cmbRating;
    JButton btnTambah, btnHapus;
    DefaultListModel<String> model;
    JList<String> daftarFilm;
    JLabel lblStatus;

    public PencatatFilm() {

        setTitle("Pencatat Film");
        setSize(450, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(
            BorderFactory.createEmptyBorder(15, 15, 15, 15)
        );

        JPanel panelInput = new JPanel(new GridLayout(4, 2, 8, 8));

        panelInput.add(new JLabel("Judul Film:"));
        txtJudul = new JTextField();
        panelInput.add(txtJudul);

        panelInput.add(new JLabel("Genre:"));
        cmbGenre = new JComboBox<>(new String[]{
            "Action", "Comedy", "Horror", "Romance", "Drama"
        });
        panelInput.add(cmbGenre);

        panelInput.add(new JLabel("Rating (1-5):"));
        cmbRating = new JComboBox<>(
            new Integer[]{1, 2, 3, 4, 5}
        );
        panelInput.add(cmbRating);

        btnTambah = new JButton("Tambah Film");
        btnHapus = new JButton("Hapus Film");

        panelInput.add(btnTambah);
        panelInput.add(btnHapus);

        model = new DefaultListModel<>();
        daftarFilm = new JList<>(model);

        JScrollPane scrollPane = new JScrollPane(daftarFilm);
        scrollPane.setBorder(
            BorderFactory.createTitledBorder("Daftar Film")
        );

        lblStatus = new JLabel("Silakan tambahkan film.");

        panel.add(panelInput, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(lblStatus, BorderLayout.SOUTH);

        add(panel);

        btnTambah.addActionListener(this);
        btnHapus.addActionListener(this);
        cmbGenre.addItemListener(this);
        cmbRating.addItemListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnTambah) {

            String judul = txtJudul.getText().trim();
            String genre = (String) cmbGenre.getSelectedItem();
            int rating = (Integer) cmbRating.getSelectedItem();

            if (judul.isEmpty()) {
                JOptionPane.showMessageDialog(
                    this, "Judul film harus diisi!"
                );
            } else {
                String film = judul + " | Genre: " + genre
                        + " | Rating: " + rating + "/5";

                model.addElement(film);

                txtJudul.setText("");
                lblStatus.setText("Film berhasil ditambahkan.");
            }

        } else if (e.getSource() == btnHapus) {

            int index = daftarFilm.getSelectedIndex();

            if (index != -1) {
                model.remove(index);
                lblStatus.setText("Film berhasil dihapus.");
            } else {
                JOptionPane.showMessageDialog(
                    this, "Pilih film yang ingin dihapus!"
                );
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (e.getStateChange() == ItemEvent.SELECTED) {

            if (e.getSource() == cmbGenre) {
                lblStatus.setText(
                    "Genre: " + cmbGenre.getSelectedItem()
                );
            }

            if (e.getSource() == cmbRating) {
                lblStatus.setText(
                    "Rating dipilih: "
                    + cmbRating.getSelectedItem() + "/5"
                );
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PencatatFilm());
    }
}
