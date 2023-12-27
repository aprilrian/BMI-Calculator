import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Controller {
    private View V;
    private Model M;

    public Controller() {
        V = new View();
        M = new Model();

        V.getHitungButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double tinggi = Double.parseDouble(V.getTinggiField().getText());
                double berat = Double.parseDouble(V.getBeratField().getText());

                double BMI = M.HitungBMI(tinggi, berat);
                String status = M.StatusBMI(BMI);

                DecimalFormat df = new DecimalFormat("#.##");
                V.getHasilLabel().setText("BMI: " + df.format(BMI));
                V.getStatusLabel().setText("Status: " + status);
            }
        });
    }
}