package co.com.udea.calidad.gestionEquipajes.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsumerThe implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String Getof = "/continents";
        actor.attemptsTo(
                Get.resource(Getof).with(
                        request -> request.relaxedHTTPSValidation()
                )
        );
    }

    public static ConsumerThe service(){
        return Tasks.instrumented(ConsumerThe.class);
    }
}
