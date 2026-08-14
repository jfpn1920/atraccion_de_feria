import java.util.Scanner;
public class atraccion_de_feria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[10];
        String[] tipos = new String[10];
        int[] capacidades = new int[10];
        int[] duraciones = new int[10];
        double[] precios = new double[10];
        int[] edadesMinimas = new int[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //------------------------------------------//
        //--|menu_principal_de_atraccion_de_feria|--//
        //------------------------------------------//
        do {
            System.out.println("menu principal de atraccion de feria");
            System.out.println("1) Registrar atraccion");
            System.out.println("2) Editar atraccion");
            System.out.println("3) Listar atracciones");
            System.out.println("4) Buscar atraccion");
            System.out.println("5) Eliminar atraccion");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-------------------------//
                //--|registrar_atraccion|--//
                //-------------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro de la atraccion");
                    System.out.println("id de la atraccion a registrar: " + id);
                    System.out.print("nombre de la atraccion: ");
                    nombres[total] = entrada.nextLine();
                    System.out.print("tipo de atraccion: ");
                    tipos[total] = entrada.nextLine();
                    System.out.print("capacidad de personas: ");
                    capacidades[total] = entrada.nextInt();
                    System.out.print("duracion del recorrido en minutos: ");
                    duraciones[total] = entrada.nextInt();
                    System.out.print("precio del boleto: ");
                    precios[total] = entrada.nextDouble();
                    System.out.print("edad minima permitida: ");
                    edadesMinimas[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("estado de la atraccion: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Atraccion registrada correctamente.");
                    total++;
                    break;
                //----------------------//
                //--|editar_atraccion|--//
                //----------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen atracciones registradas.");
                        break;
                    }
                    System.out.println("Datos de las atracciones");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Tipo: " + tipos[i] + " | Capacidad: " + capacidades[i] + " personas | Duracion: " + duraciones[i] + " minutos | Precio: " + precios[i] + " | Edad minima: " + edadesMinimas[i] + " anos | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la atraccion: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato de la atraccion");
                        System.out.print("Nuevo nombre de la atraccion: ");
                        nombres[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de atraccion: ");
                        tipos[posicion] = entrada.nextLine();
                        System.out.print("Nueva capacidad de personas: ");
                        capacidades[posicion] = entrada.nextInt();
                        System.out.print("Nueva duracion del recorrido en minutos: ");
                        duraciones[posicion] = entrada.nextInt();
                        System.out.print("Nuevo precio del boleto: ");
                        precios[posicion] = entrada.nextDouble();
                        System.out.print("Nueva edad minima permitida: ");
                        edadesMinimas[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nuevo estado de la atraccion: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Atraccion actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|listar_atracciones|--//
                //------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen atracciones registradas.");
                    } else {
                        System.out.println("Lista de atracciones");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Tipo: " + tipos[i] + " | Capacidad: " + capacidades[i] + " personas | Duracion: " + duraciones[i] + " minutos | Precio: " + precios[i] + " | Edad minima: " + edadesMinimas[i] + " anos | Estado: " + estados[i]);
                        }
                    }
                    break;
                //----------------------//
                //--|buscar_atraccion|--//
                //----------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen atracciones registradas.");
                        break;
                    }
                    System.out.println("busqueda de atraccion");
                    System.out.print("ingresa la id para buscar atraccion: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos de la atraccion encontrada:");
                        System.out.println("ID: " + idBusqueda + " | Nombre: " + nombres[posicion] + " | Tipo: " + tipos[posicion] + " | Capacidad: " + capacidades[posicion] + " personas | Duracion: " + duraciones[posicion] + " minutos | Precio: " + precios[posicion] + " | Edad minima: " + edadesMinimas[posicion] + " anos | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|eliminar_atraccion|--//
                //------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen atracciones registradas.");
                        break;
                    }
                    System.out.println("Datos de las atracciones");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Tipo: " + tipos[i] + " | Capacidad: " + capacidades[i] + " personas | Duracion: " + duraciones[i] + " minutos | Precio: " + precios[i] + " | Edad minima: " + edadesMinimas[i] + " anos | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la atraccion a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombres[i] = nombres[i + 1];
                            tipos[i] = tipos[i + 1];
                            capacidades[i] = capacidades[i + 1];
                            duraciones[i] = duraciones[i + 1];
                            precios[i] = precios[i + 1];
                            edadesMinimas[i] = edadesMinimas[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Atraccion eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Atraccion de Feria.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}