/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VETERINARIA;

import java.util.ArrayList;

/**
 *
 * @author KEYLO
 */
public class principal {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("1111111", "Ronaldo", "7777777");
        Mascota mascota1 = new Mascota("Luna", "Perro", 5, 25.5);
        Mascota mascota2 = new Mascota("Goku", "Loro", 2, 0.5);

        mascota1.setDuenio(cliente1);

        System.out.println("Due?o: " + cliente1.getNombre());
        mascota1.mostrarResumen();
        System.out.println("-----------------------");

        mascota2.mostrarResumen();

        // Configuración y llamadas de las consultas
        Veterinario veterinario1 = new Veterinario("v001", "Medicina General", "Dra Shirley Cruz");

        Consulta consulta1 = new Consulta(
                "5/10/2026",
                "Control General",
                mascota1,
                15000,
                veterinario1
        );

        consulta1.mostrarResumen();
        consulta1.actualizarcosto(17500);
        consulta1.mostrarResumen();
        consulta1.actualizarCosto(18000, "Control y medicamento");
        consulta1.mostrarResumen();

        Cliente cliente2 = new Cliente("22222222", "Carlos Mora", "888888");
        Persona personareferencia = cliente2;

        System.out.println(cliente2.getNombre());
        System.out.println(personareferencia.getNombre());

        System.out.println("========== Resumibles ==========");
        Resumible r1 = cliente1;
        Resumible r2 = mascota1;
        Resumible r3 = consulta1;

        r1.mostrarResumen();
        r2.mostrarResumen();
        r3.mostrarResumen();

        System.out.println("========== Resumibles ==========");
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(new Mascota("luffy", "perro", 1, 1));

        if (!mascotas.isEmpty()) {
            Mascota primera = mascotas.get(0);
            primera.mostrarResumen();

        }
     System.out.println("========= Recorre Array List =========");
        for (int i = 0; i < mascotas.size(); i++) {
            mascotas.get(i).mostrarResumen();
            
            
        }

        ArrayList<Consulta> consultas = new ArrayList<Consulta>();
        consultas.add(consulta1);
        consultas.add(new Consulta("12/10/2026", "Vacunas", mascota2, 10000, veterinario1));
        
        for (int i = 0; i < consultas.size(); i++) {
    consultas.get(i).mostrarResumen();
}

System.out.println("========== Recorre Array List de Resumibles ==========");
ArrayList<Resumible> resumibles = new ArrayList<Resumible>();

resumibles.add(cliente2);
resumibles.add(veterinario1);
resumibles.add(mascota2);
resumibles.add(consulta1);

for (int i = 0; i < resumibles.size(); i++) {
    resumibles.get(i).mostrarResumen();
    System.out.println("================================");
}

        System.out.println("========= Array Mascotas =========");
        Mascota[] mascotasl = new Mascota[3];
        mascotasl[0] = mascota2;
        mascotasl[1] = mascota1;
        mascotasl[2] = new Mascota("Luffy", "perro", 1, 1);
        
        if (mascotasl.length > 0) {
            System.out.println("========= Primera =========");
            Mascota primera = mascotasl[0];
            primera.mostrarResumen();
        }}}