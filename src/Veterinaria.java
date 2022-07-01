import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) {
        double VentaTotal = 0;
        ArrayList <Mascota> ListaMascota= new ArrayList<>();
        ArrayList <ExpedienteClinico> ExpedienteClinico=new ArrayList<>();
        ArrayList <Cliente> ListaCliente= new ArrayList<>();
        ArrayList <Producto> ListaProductos= new ArrayList<>();
        ListaProductos.add(new Medicamento(1,"Bully Flex",222.50,"Vitaminas","Perros"));
        ListaProductos.add(new Medicamento(2,"Iver-Full",600.50,"Desparacitante","Ganado"));
        ListaProductos.add(new Accesorio(3,"Collar Para Perro",23.50,"Collar","Perro"));
        ListaProductos.add(new Accesorio(4,"Pelota",45.50,"Juguete","Perro"));
        Scanner entrada = new Scanner(System.in);
        int opcion,id=1;
        int telefono;
        String nombre;
        do {
            System.out.println("Digite la opcion a realizar: 1. AgregarCliente  2.Ver Mascotas 3.Realizar Expediente Clinico 4.Imprimir Expediente 5.Comprar Producto 6.Ver venta total 7.Salir");
          opcion= entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Nombre: ");
                    nombre= entrada.next();
                    System.out.println("Telefono: ");
                    telefono= entrada.nextInt();
                    id+=id;
                    ListaCliente.add(new Cliente(id,nombre,telefono));
                    System.out.println("Cuantas Mascotas va a registrar?");
                    opcion= entrada.nextInt();
                    for (int i=1; i<=opcion;i++){
                        int edad;
                        String genero,tipo;
                        System.out.println("Nombre:");
                        nombre= entrada.next();
                        System.out.println("Edad: ");
                        edad=entrada.nextInt();
                        System.out.println("Genero");
                        genero=entrada.next();
                        System.out.println("Tipo de animal");
                        tipo= entrada.next();
                        ListaMascota.add(new Mascota(id,nombre,edad,tipo,genero));
                    }
                    break;
                case 2:
                    System.out.println("Inserte el nombre del cliente: ");
                    String buscar;
                    int idBuscar=1;

                    buscar= entrada.next();
                    BUSCAR: for (Cliente cliente : ListaCliente){
                        if (cliente.getNombre().equals(buscar)){
                            System.out.println("Lo encontreee: ");
                            idBuscar= cliente.getId();
                            System.out.println("Nombre: " + cliente.getNombre());
                            System.out.println("Telefono: "+ cliente.getTelefono());
                        }

                    }
                    BUSCAR: for (Mascota mascota : ListaMascota){
                        if (mascota.getId()==idBuscar){
                            System.out.println("Nombre de la mascota "+ mascota.getNombre());

                        }

                    }
                    break;
                   case  3:
                       System.out.println("Digite el nombre de la mascota");
                       nombre= entrada.next();
                       String estado,vacunas;
                       double peso;
                       BUSCAR: for (Mascota mascota : ListaMascota){
                           if (mascota.getNombre().equals(nombre)){
                               System.out.println("Estado de la mascota");
                               estado= entrada.next();
                               System.out.println("Peso de la mascota");
                               peso= entrada.nextDouble();
                               id=mascota.getId();
                               System.out.println("Vacunas: ");
                               vacunas= entrada.next();

                               ExpedienteClinico.add(new ExpedienteClinico(id,mascota.getNombre(),mascota.getEdad(),mascota.getTipo(),
                                          mascota.getGenero(),estado,peso,vacunas,new Date() ));

                           }

                       }
                       break;
                case 4:
                    System.out.println("Nombre de la mascota: ");
                    nombre= entrada.next();
                    BUSCAR: for (ExpedienteClinico expedienteClinico : ExpedienteClinico){
                        if (expedienteClinico.getNombre().equals(nombre)){
                            System.out.println("Nombre de la mascota: "+ expedienteClinico.getNombre());
                            System.out.println("Edad: "+ expedienteClinico.getEdad());
                            System.out.println("Tipo: "+ expedienteClinico.getTipo());
                            System.out.println("Genero: "+ expedienteClinico.getGenero());
                            System.out.println("Estado: "+ expedienteClinico.getEstado());
                            System.out.println("Peso: "+expedienteClinico.getPeso());
                            System.out.println("Vacunas: "+expedienteClinico.getVacunas());
                            System.out.println("Fecha del folio:" + expedienteClinico.getFecha());

                        }
                    }
                    break;
                case 5:
                    boolean validar=false;
                    do {
                        
                    System.out.println("Que desea comprar? : ");
                                IMPRIMIR : for (Producto producto: ListaProductos){
                                    System.out.println("Nombre "+ producto.getNombre());
                                    System.out.println("Precio "+producto.getPrecio());
                                }
                                 System.out.println("Escoja el producto: ");
                                 nombre= entrada.next();
                                BUSCAR: for (Producto producto: ListaProductos){
                                     if (producto.getNombre().equals(nombre)){
                                         VentaTotal+=producto.getPrecio();
                                         validar=true;
                                         System.out.println("Gracias por su compra usted compro: "+ producto.getNombre());
                                     }
                                }
                    }while (!validar);
                                    break;
                case 6:
                    System.out.println("La venta total es: " + VentaTotal);


        }
        }    while (opcion<=6);
    }

}
