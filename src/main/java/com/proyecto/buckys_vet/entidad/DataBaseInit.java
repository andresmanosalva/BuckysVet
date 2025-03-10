package com.proyecto.buckys_vet.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import com.proyecto.buckys_vet.repositorio.DuenoRepositorio;
import com.proyecto.buckys_vet.repositorio.MascotaRepositorio;

import jakarta.transaction.Transactional;

@Controller
@Transactional
public class DataBaseInit implements ApplicationRunner {
    
    @Autowired
    DuenoRepositorio duenoRepositorio;
    @Autowired
    MascotaRepositorio mascotaRepositorio;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        duenoRepositorio.save(new Dueno("Andres", "Perez", "123456789", "123456789", "123456789"));
        mascotaRepositorio.save(new Mascota("Bucky", "Perro", 4, 15.2, "Ninguna",
                "https://plus.unsplash.com/premium_photo-1694819488591-a43907d1c5cc?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8cGVycm98ZW58MHx8MHx8fDA=",
                "123456789"));
        mascotaRepositorio.save(new Mascota("Bucky", "Perro", 4, 15.2, "Ninguna",
                "https://plus.unsplash.com/premium_photo-1694819488591-a43907d1c5cc?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8cGVycm98ZW58MHx8MHx8fDA%3D", "561119188"));
        mascotaRepositorio.save(new Mascota("Luna", "Gato", 2, 5.3, "Alergia alimentaria",
                "https://plus.unsplash.com/premium_photo-1673967831980-1d377baaded2?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Z2F0b3N8ZW58MHx8MHx8fDA%3D","1019198161"));
        mascotaRepositorio.save(new Mascota("Simba", "Gato", 3, 7.8, "Ninguna",
                "https://images.unsplash.com/photo-1536589961747-e239b2abbec2?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8Z2F0b3N8ZW58MHx8MHx8fDA%3D","981977816"));
        mascotaRepositorio.save(new Mascota("Coco", "Perro", 1, 8.5, "Parvovirus",
                "https://images.unsplash.com/photo-1517849845537-4d257902454a?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8cGVycm98ZW58MHx8MHx8fDA%3D","51959840"));
        mascotaRepositorio.save(new Mascota("Rocky", "Perro", 5, 20.3, "Displasia de cadera",
                "https://images.unsplash.com/photo-1583511655826-05700d52f4d9?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDZ8fHBlcnJvfGVufDB8fDB8fHww","9994856616"));
        mascotaRepositorio.save(new Mascota("Bella", "Gato", 4, 6.1, "Ninguna",
                "https://images.unsplash.com/photo-1582725461742-8ecd962c260d?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzF8fGdhdG9zfGVufDB8fDB8fHww","71801984"));
        mascotaRepositorio.save(new Mascota("Max", "Perro", 7, 12.4, "Artrosis",
                "https://images.unsplash.com/photo-1575859431774-2e57ed632664?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDh8fHBlcnJvfGVufDB8fDB8fHww","021378935"));
        mascotaRepositorio.save(new Mascota("Milo", "Gato", 1, 4.5, "Ninguna",
                "https://images.unsplash.com/flagged/photo-1557427161-4701a0fa2f42?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzB8fGdhdG9zfGVufDB8fDB8fHww","618741045"));
        mascotaRepositorio.save(new Mascota("Toby", "Perro", 2, 10.0, "Infección en el oído",
                "https://images.unsplash.com/photo-1596492784531-6e6eb5ea9993?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjh8fHBlcnJvfGVufDB8fDB8fHww","9529        1971"));
        mascotaRepositorio.save(new Mascota("Rex", "Perro", 6, 25.1, "Ninguna",
                "https://images.unsplash.com/photo-1491604612772-6853927639ef?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzJ8fHBlcnJvfGVufDB8fDB8fHww","98196165661"));
        mascotaRepositorio.save(new Mascota("Maggie", "Perro", 8, 18.7, "Cataratas",
                "https://images.unsplash.com/photo-1591946559594-8c6d3b7391eb?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTh8fHBlcnJvfGVufDB8fDB8fHww","74126932365"));
        mascotaRepositorio.save(new Mascota("Charlie", "Gato", 5, 6.0, "Insuficiencia renal",
                "https://images.unsplash.com/photo-1606509769472-7660d4a478ac?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTR8fGdhdG9zfGVufDB8fDB8fHww","2185965146"));
        mascotaRepositorio.save(new Mascota("Sasha", "Gato", 3, 5.8, "Ninguna",
                "https://images.unsplash.com/photo-1530305016043-f725a9268648?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NjN8fGdhdG9zfGVufDB8fDB8fHww","521269856"));
        mascotaRepositorio.save(new Mascota("Duke", "Perro", 2, 13.0, "Dermatitis",
                "https://images.unsplash.com/photo-1546491764-67a5b8d5b3ae?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NzR8fHBlcnJvfGVufDB8fDB8fHww","6554566566"));
        mascotaRepositorio.save(new Mascota("Zoe", "Perro", 4, 9.7, "Obesidad",
                "https://images.unsplash.com/photo-1588269845464-8993565cac3a?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8ODB8fHBlcnJvfGVufDB8fDB8fHww","04578962156"));

        duenoRepositorio.save(new Dueno("1234", "Juan Pérez", "juan.perez@email.com", "3001234567",
                "https://media.istockphoto.com/id/1364917563/photo/businessman-smiling-with-arms-crossed-on-white-background.jpg?s=612x612&w=0&k=20&c=NtM9Wbs1DBiGaiowsxJY6wNCnLf0POa65rYEwnZymrM="));
        duenoRepositorio.save(new Dueno("5678", "Ana Gómez", "ana.gomez@email.com", "3019876543",
                "https://media.istockphoto.com/id/1386479313/photo/happy-millennial-afro-american-business-woman-posing-isolated-on-white.jpg?s=612x612&w=0&k=20&c=8ssXDNTp1XAPan8Bg6mJRwG7EXHshFO5o0v9SIj96nY="));
        duenoRepositorio.save(new Dueno("9012", "Carlos Ramírez", "carlos.ramirez@email.com", "3204567890",
                "https://media.istockphoto.com/id/1934523168/photo/portrait-of-senior-businessman-smiling-at-isolated-background.jpg?s=612x612&w=0&k=20&c=FfW3wIKN5a-FWSm1-wPIdbg7P_mCQ9suNKsejQCnuf4="));
        duenoRepositorio.save(new Dueno("3456", "Laura Sánchez", "laura.sanchez@email.com", "3106784321",
                "https://media.istockphoto.com/id/1180926773/photo/studio-waist-up-portrait-of-a-beautiful-businesswoman-with-crossed-arms.jpg?s=612x612&w=0&k=20&c=ksj6EMM6NiETqyOptZ43dR3dKT57gdoL7RnehQ0spBk="));
        duenoRepositorio.save(new Dueno("7890", "Pedro Fernández", "pedro.fernandez@email.com", "3223456789",
                "https://media.istockphoto.com/id/1330244892/photo/man-in-jacket-with-his-arms-folded-across-chest.jpg?s=612x612&w=0&k=20&c=qTG8aNXiCVMuC9CpITA9KI881I8OvaZE7Qc-gCLA05I="));
        duenoRepositorio.save(new Dueno("2345", "María López", "maria.lopez@email.com", "3156789012",
                "https://media.istockphoto.com/id/1369508766/photo/beautiful-successful-latin-woman-smiling.jpg?s=612x612&w=0&k=20&c=LoznG6eGT42_rs9G1dOLumOTlAveLpuOi_U755l_fqI="));
        duenoRepositorio.save(new Dueno("6789", "Luis Torres", "luis.torres@email.com", "3178901234",
                "https://media.istockphoto.com/id/1192320181/photo/happy-laughing-guy-posing-with-arms-folded.jpg?s=612x612&w=0&k=20&c=VhRenDhwf8VKyHFv7aeSvU7r7bOeC138qTeyX3gCnyA="));
        duenoRepositorio.save(new Dueno("1122", "Gabriela Méndez", "gabriela.mendez@email.com", "3187654321",
                "https://media.istockphoto.com/id/1386863107/photo/smiling-happy-caucasian-young-woman-in-denim-shirt-looking-at-camera-with-arms-crossed.jpg?s=612x612&w=0&k=20&c=KC56kbC7kmMua_Hm2Qxy94l4aGmmwDcWs2WbchtBOT8="));
        duenoRepositorio.save(new Dueno("3344", "Fernando Castillo", "fernando.castillo@email.com", "3199876543",
                "https://media.istockphoto.com/id/1542566108/photo/young-businessman-smiling-at-camera.jpg?s=612x612&w=0&k=20&c=cDoT9LelcDARm3sxck6UWICgsWjOXtUgXg2Bwdq7XNU="));
        duenoRepositorio.save(new Dueno("5566", "Sofía Herrera", "sofia.herrera@email.com", "3206547890",
                "https://media.istockphoto.com/id/1289220949/photo/successful-smiling-woman-wearing-eyeglasses-on-grey-wall.jpg?s=612x612&w=0&k=20&c=BjyPRn28F3mc6IiBCf4Ko-lFZisaNUYXBBnAcO47ZgE="));
        Dueno asociar = duenoRepositorio.findById(1L).get();
        for (Mascota m : mascotaRepositorio.findAll()) {
            m.setDueno(asociar);
            mascotaRepositorio.save(m);
        }
    }
}
