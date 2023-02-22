package starter.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CrediAvailable implements Question<String> {
    public static Question<String> value(){
        return new CrediAvailable();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(FinanciaOverview.CREDIT_AVAILABLE).getText();
    }
}
