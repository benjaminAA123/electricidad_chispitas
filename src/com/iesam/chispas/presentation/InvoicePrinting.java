package com.iesam.chispas.presentation;
import com.iesam.chispas.domain.models.*;

/*
/ Código de Factura. | Fecha de Factura.
○ Cif/Nif del cliente
○ Nombre del cliente.
○ Dirección del cliente.
○ Población del cliente.
○ Provincia del cliente.
○ Además tiene entre 1 a N líneas de ventas (productos y servicios) con esta información:
■ Código
■ Nombre
■ Precio (10€)
■ Tipo IVA (21%)
■ Total con IVA (precio + IVA) (12,1€)
○ Base Imponible
○ Total Factura
 */

public class InvoicePrinting {




      public static void print(User factura) {
            System.out.println("Codido cliente:");
            System.out.println(factura.getIdClient());
            System.out.println("Nombre del cliente");
            System.out.println(factura.getName());
            System.out.println("Direccion del cliente:");
            System.out.println(factura.getPostal());
            System.out.println("Poblacion del cliente:");
            System.out.println(factura.getPopulation() );
            System.out.println("Provincia del cliente:");
            System.out.print(factura.getProvince());
      }

      public static void print(Societies factura) {
            System.out.println("Cif/Nif del cliente");
            System.out.println(factura.getCif());
      }


      public static void print(Product factura) {
            System.out.println("Codigo producto:");
            System.out.println(factura.getIdProduct());
            System.out.println("Nombre del producto:");
            System.out.println(factura.getName());
            System.out.println("Codido del servicio:");
            System.out.println(factura.getPrice());
            System.out.println("Codido del servicio:");
            System.out.println(factura.getVatRate());
            System.out.println("Codido del servicio:");
      }


      public static void print(Invoices factura) {

            System.out.println("Codigo factura:");
            System.out.println(factura.getIdInvoice());
            System.out.println("Fecha factura:");
            System.out.println(factura.getInvoiceDate());

            System.out.println("RESUMEN FACTURA");
            System.out.print(factura.getTaxBase());
      }


}








