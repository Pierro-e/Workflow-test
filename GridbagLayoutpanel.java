import java.awt.*;
import java.awt.event.*;

class GridBagLayoutPanel extends Panel
{
    // Erstellung der einzelnen Komponenten
    private TextField tf= new TextField();
    private TextArea ta = new TextArea(8,32);
    private Button b1 = new Button("Yeet");
    private Button b2 = new Button("What's");
    private Button b3 = new Button("a");
    private Button b4 = new Button("Yeet?");
    private Button b5 = new Button("YEEEEET");

    // Erstellung der GridBagConstraints
    GridBagConstraints c = new GridBagConstraints();


    // Erstellung des GridBagPanels
    public GridBagLayoutPanel()
    {
        // Setzen der Schriftformatierung und des panelLayouts
        this.setFont(new Font("System", Font.PLAIN, 22));
        this.setLayout(new GridBagLayout());

        // Erstellen des Eingabe-Label
        c.fill      = GridBagConstraints.BOTH;
        c.gridx     = 0;
        c.gridy     = 0;
        this.add(new Label("Eingabe:"),c);

        // Erstellen des Eingabefelds rechts neben Eingabe:
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridx     = 1;  
        c.gridy     = 0;   
        this.add(tf,c);

        // Erstellen einer Textanzeige
        c.gridx     = 0;  
        c.gridy     = 1;
        this.add(ta, c);

        // Erstellen der Buttons
        // anstatt gridx manuell immer hochzuzählen, SOLLTE man am Anfang c.gridx = GridBagConstraints.RELATIVE; schreiben!
        c.gridwidth = GridBagConstraints.BOTH;
        c.gridx     = GridBagConstraints.RELATIVE;
        c.gridy     = 2;
        this.add(b1,c);
        this.add(b2,c);
        this.add(b3,c);
        this.add(b4,c);
        this.add(b5,c);
    }


    public static void main(String[] args)
    {

        // Frame mit GridBagLayout erstellen
        Frame f = new Frame("Testteil");
        GridBagLayoutPanel GBL = new GridBagLayoutPanel();
        f.add(GBL);
        
        // Add Fenster schließen, wenn auf x geklickt wird
        f.addWindowListener
        (
            new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent e) {System.exit(0);};
            }
        );

        //Frame eine Größe geben und ihn sichtbar machen
        f.pack();
        f.setVisible(true);
    }
}