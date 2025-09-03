package interfaz;

public class Datos {
    private String Rutina1ha="Rutina:\n" +
            "3–4 días de entrenamiento de fuerza (pesas, máquinas, calistenia).\n" +
            "Enfocarse en ejercicios compuestos: sentadillas, press banca, dominadas.\n" +
            "15–20 min de cardio ligero 2 veces/semana (caminar rápido o bici suave).\n";
    private String Rutina1N="Rutina:\n" +"Ejercicios de fuerza con peso ligero o el propio cuerpo.\n" +
            "Caminatas diarias 20–30 min.\n" +
            "Evitar ejercicios de alto impacto para prevenir lesiones";
    private String Rutina1ma="Rutina:\n" +"3 días de fuerza con bandas, mancuernas o máquinas.\n" +
            "Énfasis en tren inferior (glúteos, piernas) y correr.\n" +
            "Yoga o pilates 1 día para mejorar postura.";

    private String Rutina2ha="Rutina:\n" +"4–5 días/semana.\n" +
            "Mezcla de fuerza (pesas 3 días) \n"+" cardio moderado (2 días de correr, nadar o bicicleta).\n" +
            "Estiramientos 10 min después de cada sesión.\n";
    private String Rutina2N="Rutina:\n" +"Caminatas diarias (30–40 min).\n" +
            "2–3 días de fuerza ligera (pesas pequeñas o bandas).\n" +
            "Ejercicios de movilidad articular y equilibrio.";
    private String Rutina2ma="Rutina:\n" +"4 días/semana.\n" +
            "Circuitos funcionales (fuerza + cardio en intervalos).\n" +
            "1 día extra de actividad recreativa: baile, yoga, zumba";

    private String Rutina3ha="Rutina:\n" +"4–5 días/semana.\n" +
            "Cardio moderado a intenso (bicicleta, trote, HIIT progresivo).\n" +
            "2–3 días de fuerza (para no perder músculo).";
    private String Rutina3N="Rutina:\n" +"Caminatas de 20–30 min diarios.\n" +
            "Ejercicios acuáticos (menos impacto en articulaciones).\n" +
            "Fuerza ligera con bandas para preservar masa muscular.";
    private String Rutina3ma="Rutina:\n" +"4 días/semana.\n" +
            "Caminatas rápidas, zumba, natación o elíptica.\n" +
            "2 días de fuerza (bandas elásticas, circuitos con peso corporal).";

    private String Rutina4ha="Rutina:\n" +"Cardio bajo impacto: bicicleta estática, remo, natación.\n" +
            "3 días de fuerza con máquinas (controladas para evitar lesiones).\n" +
            "Caminar cada día 20–40 min";
    private String Rutina4N="Rutina:\n" +"Caminatas cortas pero frecuentes (10–15 min varias veces al día).\n" +
            "Natación o bicicleta estática.\n" +
            "Ejercicios de equilibrio para prevenir caídas.\n";
    private String Rutina4ma="Rutina:\n" +"4–5 días de caminatas largas, bicicleta o agua-aeróbicos.\n" +
            "Fuerza progresiva (bandas, mancuernas ligeras).\n" +
            "Ejercicios de movilidad y respiración.\n";
    //--------------------------------------------------------------------------------
    private String Dieta1="Dieta:\n" +"Desayuno: avena con leche + huevo + fruta (banano o mango).\n" +
            "Media mañana: yogurt griego + frutos secos.\n" +
            "Almuerzo: arroz + pollo o pescado + aguacate + ensalada.\n" +
            "Merienda: batido de proteínas (leche + fruta + mantequilla de maní).\n" +
            "Cena: tortilla de huevo + queso + pan integral.\n" +
            "Recomendación: excedente calórico ligero (+300-500 kcal/día).";

    private String Dieta2="Dieta:\n"+"Desayuno: pan integral + queso fresco + café o té.\n" +
            "Media mañana: fruta + semillas (chía o linaza).\n" +
            "Almuerzo: plato balanceado (½ verduras, ¼ proteínas, ¼ carbohidratos).\n" +
            "Merienda: batido verde (espinaca + manzana + pepino).\n" +
            "Cena: sopa de verduras + proteína ligera (pescado, pollo).\n" +
            "Recomendación: mantener balance energético (ni déficit ni superávit).";

    private String Dieta3="Dieta:\n"+"Desayuno: omelette de claras (huevo) + vegetales + café sin azúcar.\n" +
            "Media mañana: fruta baja en azúcar (manzana, pera).\n" +
            "Almuerzo: proteínas magras (pollo, pavo, pescado) + ensalada + quinoa o batata.\n" +
            "Merienda: puñado de almendras o zanahorias.\n" +
            "Cena: crema de verduras + huevo cocido.\n" +
            "Recomendación: déficit calórico moderado (-300 a -500 kcal/día), evitar fritos y ultra procesados.";

    private String Dieta4="Dieta:\n"+"Desayuno: smoothie bajo en calorías (espinaca + kiwi + proteína en polvo).\n" +
            "Media mañana: gelatina sin azúcar o té verde.\n" +
            "Almuerzo: proteínas magras + verduras al vapor + mínima cantidad de carbohidratos complejos.\n" +
            "Merienda: yogurt natural sin azúcar.\n" +
            "Cena: ensalada + proteínas ligeras (pechuga de pollo o pescado blanco).\n" +
            "Recomendación: déficit calórico supervisado por nutricionista, fraccionar comidas en 5–6\n" +
            "pequeñas porciones al día.";
    //-------------------------------------------------------------------------------------------------------


    public String getRutina1ha() {
        return Rutina1ha;
    }

    public String getRutina1N() {
        return Rutina1N;
    }

    public String getRutina1ma() {
        return Rutina1ma;
    }

    public String getRutina2ha() {
        return Rutina2ha;
    }

    public String getRutina2N() {
        return Rutina2N;
    }

    public String getRutina2ma() {
        return Rutina2ma;
    }

    public String getRutina3ha() {
        return Rutina3ha;
    }

    public String getRutina3N() {
        return Rutina3N;
    }

    public String getRutina3ma() {
        return Rutina3ma;
    }

    public String getRutina4ha() {
        return Rutina4ha;
    }

    public String getRutina4N() {
        return Rutina4N;
    }

    public String getRutina4ma() {
        return Rutina4ma;
    }

    public String getDieta1() {
        return Dieta1;
    }

    public String getDieta2() {
        return Dieta2;
    }

    public String getDieta3() {
        return Dieta3;
    }

    public String getDieta4() {
        return Dieta4;
    }
}
