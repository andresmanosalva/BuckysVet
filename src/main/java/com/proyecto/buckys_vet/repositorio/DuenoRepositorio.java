package com.proyecto.buckys_vet.repositorio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.proyecto.buckys_vet.entidad.Dueno;

@Repository
public class DuenoRepositorio {

    public Map<String, Dueno> mapaDuenos = new HashMap<>();

    public DuenoRepositorio() {
        mapaDuenos.put("1234", new Dueno("1234", "Juan Pérez", "juan.perez@email.com", "3001234567", "https://media.istockphoto.com/id/1364917563/photo/businessman-smiling-with-arms-crossed-on-white-background.jpg?s=612x612&w=0&k=20&c=NtM9Wbs1DBiGaiowsxJY6wNCnLf0POa65rYEwnZymrM="));
        mapaDuenos.put("5678", new Dueno("5678", "Ana Gómez", "ana.gomez@email.com", "3019876543","https://media.istockphoto.com/id/1386479313/photo/happy-millennial-afro-american-business-woman-posing-isolated-on-white.jpg?s=612x612&w=0&k=20&c=8ssXDNTp1XAPan8Bg6mJRwG7EXHshFO5o0v9SIj96nY="));
        mapaDuenos.put("9012", new Dueno("9012", "Carlos Ramírez", "carlos.ramirez@email.com", "3204567890", "https://media.istockphoto.com/id/1934523168/photo/portrait-of-senior-businessman-smiling-at-isolated-background.jpg?s=612x612&w=0&k=20&c=FfW3wIKN5a-FWSm1-wPIdbg7P_mCQ9suNKsejQCnuf4="));
        mapaDuenos.put("3456", new Dueno("3456", "Laura Sánchez", "laura.sanchez@email.com", "3106784321", "https://media.istockphoto.com/id/1180926773/photo/studio-waist-up-portrait-of-a-beautiful-businesswoman-with-crossed-arms.jpg?s=612x612&w=0&k=20&c=ksj6EMM6NiETqyOptZ43dR3dKT57gdoL7RnehQ0spBk="));
        mapaDuenos.put("7890", new Dueno("7890", "Pedro Fernández", "pedro.fernandez@email.com", "3223456789","https://media.istockphoto.com/id/1330244892/photo/man-in-jacket-with-his-arms-folded-across-chest.jpg?s=612x612&w=0&k=20&c=qTG8aNXiCVMuC9CpITA9KI881I8OvaZE7Qc-gCLA05I="));
        mapaDuenos.put("2345", new Dueno("2345", "María López", "maria.lopez@email.com", "3156789012","https://media.istockphoto.com/id/1369508766/photo/beautiful-successful-latin-woman-smiling.jpg?s=612x612&w=0&k=20&c=LoznG6eGT42_rs9G1dOLumOTlAveLpuOi_U755l_fqI="));
        mapaDuenos.put("6789", new Dueno("6789", "Luis Torres", "luis.torres@email.com", "3178901234","https://media.istockphoto.com/id/1192320181/photo/happy-laughing-guy-posing-with-arms-folded.jpg?s=612x612&w=0&k=20&c=VhRenDhwf8VKyHFv7aeSvU7r7bOeC138qTeyX3gCnyA="));
        mapaDuenos.put("1122", new Dueno("1122", "Gabriela Méndez", "gabriela.mendez@email.com", "3187654321","https://media.istockphoto.com/id/1386863107/photo/smiling-happy-caucasian-young-woman-in-denim-shirt-looking-at-camera-with-arms-crossed.jpg?s=612x612&w=0&k=20&c=KC56kbC7kmMua_Hm2Qxy94l4aGmmwDcWs2WbchtBOT8="));
        mapaDuenos.put("3344", new Dueno("3344", "Fernando Castillo", "fernando.castillo@email.com", "3199876543","https://media.istockphoto.com/id/1542566108/photo/young-businessman-smiling-at-camera.jpg?s=612x612&w=0&k=20&c=cDoT9LelcDARm3sxck6UWICgsWjOXtUgXg2Bwdq7XNU="));
        mapaDuenos.put("5566", new Dueno("5566", "Sofía Herrera", "sofia.herrera@email.com", "3206547890","https://media.istockphoto.com/id/1289220949/photo/successful-smiling-woman-wearing-eyeglasses-on-grey-wall.jpg?s=612x612&w=0&k=20&c=BjyPRn28F3mc6IiBCf4Ko-lFZisaNUYXBBnAcO47ZgE="));


        System.out.println("Dueños cargados: " + mapaDuenos.size());
    }

    public Collection<Dueno> obtenerTodos() {
        return mapaDuenos.values();
    }

    public Dueno obtenerPorCedula(String id) {
        return mapaDuenos.get(id);
    }

    public void agregar(Dueno dueno) {
        mapaDuenos.put(dueno.getCedula(), dueno);
    }

    public void modificar(Dueno dueno) {
        mapaDuenos.put(dueno.getCedula(), dueno);
    }

    public void eliminar(String id) {
        mapaDuenos.remove(id);
    }
}
