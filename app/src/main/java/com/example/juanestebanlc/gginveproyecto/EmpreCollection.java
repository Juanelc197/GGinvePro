package com.example.juanestebanlc.gginveproyecto;

import java.util.ArrayList;

/**
 * Created by Juan Esteban LC on 17/07/2017.
 */

public class EmpreCollection {

    public static ArrayList<Empre> getEmpre() {

        ArrayList<Empre> empres = new ArrayList<>();
        Empre em = new Empre();

        em.setNombre("Avast");
        em.setDescripcion("Es un software antivirus y suite de seguridad de la firma checa Avast Software (antes llamada ALWIL Software).");
        em.setUtl("http://www.freeiconspng.com/uploads/avast-icon-13.png");
        empres.add(em);
        em = new Empre();

        em.setNombre("Kaspersky");
        em.setDescripcion("Es un antivirus que realiza una excelente combinación de protección reactiva y preventiva, protegiéndote eficazmente de virus, troyanos y todo tipo de programas malignos.");
        em.setUtl("http://logok.org/wp-content/uploads/2014/12/Kaspesky-logo-880x655.png");
        empres.add(em);
        em = new Empre();

        em.setNombre("Office");
        em.setDescripcion("Es un paquete de programas informáticos para oficina desarrollado por Microsoft.");
        em.setUtl("https://kbpdfstudio.qoppa.com/wp-content/uploads/Office-Logo.png");
        empres.add(em);
        em = new Empre();

        em.setNombre("SolidWorks");
        em.setDescripcion("Es un software CAD (diseño asistido por computadora) para modelado mecánico en 3D, desarrollado en la actualidad por SolidWorks Corp.");
        em.setUtl("http://static.wixstatic.com/media/65c5d9_be67a1ee822344c9a408b9e2835b5a14~mv2.png_256");
        empres.add(em);
        em = new Empre();

        em.setNombre("Windows 10");
        em.setDescripcion("Es el último sistema operativo desarrollado por Microsoft como parte de la familia de sistemas operativos Windows NT.");
        em.setUtl("https://www.devexpress.com/products/net/controls/win10apps/i/landing/windows-logo.png");
        empres.add(em);
        em = new Empre();


        return empres;

    }

}
