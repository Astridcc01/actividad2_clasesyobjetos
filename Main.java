public class Cliente{
    public static void main(String args[]){
        
        Cliente cliente = new Cliente();
        cliente.setNombre("Indra");
        cliente.setCiudad("Madrid");
        cliente.setPresupuesto("10.000");
        
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getCiudad());
        System.out.println(cliente.getPresupuesto());
        
        
        Cliente cliente = new Cliente();
        cliente2.setNombre("Vass");
        cliente2.setCiudad("Valencia");
        cliente2.setPresupuesto("12.000");
        
        System.out.println(cliente2.getNombre());
        System.out.println(cliente2.getCiudad());
        System.out.println(cliente2.getPresupuesto());
    }
}
