/**
 * Created by Lawrence on 10/17/15.
 */
public class Coffee extends Product{
    private String origin;
    private String roast;
    private String flavor;
    private String aroma;
    private String acidity;
    private String body;
    public Coffee(String initialCode,
                  String initialDescription,
                  double initialPrice,
                  String initialOrigin,
                  String initialRoast,
                  String initalFlavor,
                  String initialAroma,
                  String initaAcidity,
                  String initialBody) {
        super(initialCode, initialDescription, initialPrice);
        origin = initialOrigin;
        roast = initialRoast;
        flavor = initalFlavor;
        aroma = initialAroma;
        acidity = initaAcidity;
        body = initialBody;
    }
    public String getOrigin() {
        return origin;
    }

    public String getRoast() {
        return roast;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getAroma() {
        return aroma;
    }

    public String getAcidity() {
        return acidity;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return super.toString() + "_" + origin + "_" + roast + "_" + flavor + "_" + aroma + "_" + acidity + "_" + body;
    }
}
