package Utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

public class Utils {
    static NumberFormat numberFormat =
            new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
    public static String doubleToString(Double value){
        return numberFormat.format(value);
    }
}
