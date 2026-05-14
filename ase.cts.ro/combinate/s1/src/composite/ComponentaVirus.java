package composite;

public interface ComponentaVirus {
        void adaugaNod(ComponentaVirus componenta) throws Exception;
        void stergeNod(ComponentaVirus componenta) throws Exception;
        ComponentaVirus getNod(int index) throws Exception;
        void descriere();
        int getTotalCazuri();
    }

