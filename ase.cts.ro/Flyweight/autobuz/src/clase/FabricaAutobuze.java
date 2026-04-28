package clase;
import java.util.HashMap;
public class FabricaAutobuze {
        private HashMap<Integer, Transport> autobuze;

        public FabricaAutobuze() {
            autobuze = new HashMap<>();
        }
        public Transport getAutobuz(int linie) {

            Transport autobuz = autobuze.get(linie);

            if (autobuz == null) {


                autobuz = new Autobuz( linie,"Standard", 50);

                autobuze.put(linie, autobuz);

                System.out.println("Autobuz creat pentru linia " + linie);
            }


            return autobuz;
        }


        public int getNumarAutobuze() {
            return autobuze.size();
        }
    }

