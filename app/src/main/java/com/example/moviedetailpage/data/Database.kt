package com.example.moviedetailpage.data

import com.example.moviedetailpage.R

object Database {

    val actors = listOf(
        Actor(
            1, "Shameik", "Moore", listOf(
                ActorMovie(1, "Miles Morales/Spider-Man")
            ), "https://tr.web.img3.acsta.net/c_162_216/pictures/14/12/05/13/45/453276.jpg"
        ),
        Actor(
            2, "Hailee", "Steinfeld", listOf(
                ActorMovie(1, "Gwen Stacey/Spider-Gwen")
            ), "https://tr.web.img2.acsta.net/c_162_216/pictures/19/08/27/10/13/0826817.jpg"
        ),
        Actor(
            3,
            "Oscar",
            "Isaac",
            listOf(
                ActorMovie(1, "Miguel OHara/Spider-Man 2099"),
            ),
            "https://avatars.mds.yandex.net/i?id=1edd56c83b8709292878510693f6037025b8e399-7546740-images-thumbs&n=13"
        ),
        Actor(
            4, "Issa", "Rae", listOf(
                ActorMovie(1, "Jessica Drew/Spider-Woman")
            ), "https://tr.web.img2.acsta.net/c_162_216/pictures/16/01/27/17/54/439095.jpg"
        ),
        Actor(
            5,
            "Austin",
            "Lin",
            listOf(
                ActorMovie(9, "Mao Pang-yu")
            ),
            "data:image/jpeg;base64,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"
        ),
        Actor(
            6,
            "Aaron",
            "Yan",
            listOf(
                ActorMovie(9, "Chen Chia-Hao")
            ),
            "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/4QEBRXhpZgAASUkqAAgAAAABAA4BAgDfAAAAGgAAAAAAAABUQUlQRUksIFRBSVdBTiAtIERFQ0VNQkVSIDA5OiAgKENISU5BIE9VVCkgU2luZ2VyIEFhcm9uIFlhbiBhdHRlbmRzIHByZXNzIGNvbmZlcmVuY2Ugb2YgT1BUIG9uIERlY2VtYmVyIDksIDIwMTQgaW4gVGFpcGVpLCBUYWl3YW4gb2YgQ2hpbmEuICAoUGhvdG8gYnkgVmlzdWFsIENoaW5hIEdyb3VwIHZpYSBHZXR0eSBJbWFnZXMvVmlzdWFsIENoaW5hIEdyb3VwIHZpYSBHZXR0eSBJbWFnZXMp/+0BLlBob3Rvc2hvcCAzLjAAOEJJTQQEAAAAAAERHAJQAANWQ0ccAngA31RBSVBFSSwgVEFJV0FOIC0gREVDRU1CRVIgMDk6ICAoQ0hJTkEgT1VUKSBTaW5nZXIgQWFyb24gWWFuIGF0dGVuZHMgcHJlc3MgY29uZmVyZW5jZSBvZiBPUFQgb24gRGVjZW1iZXIgOSwgMjAxNCBpbiBUYWlwZWksIFRhaXdhbiBvZiBDaGluYS4gIChQaG90byBieSBWaXN1YWwgQ2hpbmEgR3JvdXAgdmlhIEdldHR5IEltYWdlcy9WaXN1YWwgQ2hpbmEgR3JvdXAgdmlhIEdldHR5IEltYWdlcykcAm4AIFZpc3VhbCBDaGluYSBHcm91cCB2aWEgR2V0dHkgSW1hAP/hA8VodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvAAk8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiPgoJCTxyZGY6RGVzY3JpcHRpb24gcmRmOmFib3V0PSIiIHhtbG5zOnBob3Rvc2hvcD0iaHR0cDovL25zLmFkb2JlLmNvbS9waG90b3Nob3AvMS4wLyIgeG1sbnM6SXB0YzR4bXBDb3JlPSJodHRwOi8vaXB0Yy5vcmcvc3RkL0lwdGM0eG1wQ29yZS8xLjAveG1sbnMvIiB4bWxuczpHZXR0eUltYWdlc0dJRlQ9Imh0dHA6Ly94bXAuZ2V0dHlpbWFnZXMuY29tL2dpZnQvMS4wLyIgeG1sbnM6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"
        ),
        Actor(
            7,
            "Gingle",
            "Wang",
            listOf(
                ActorMovie(9, "Lin Tzu-ching")
            ),
            "data:image/jpeg;base64,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"
        ),
        Actor(
            8,
            "Man-Chiao ",
            "Wang",
            listOf(
                ActorMovie(9, "Mao Chen A-lan")
            ),
            "data:image/jpeg;base64,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"
        ),
        Actor(
            9,
            "Michael Jai",
            "White",
            listOf(
                ActorMovie(2, "Mark")
            ),
            "data:image/jpeg;base64,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"
        ),
        Actor(
            10,
            "Gillian",
            "White",
            listOf(
                ActorMovie(2, "Akilah")
            ),
            "https://m.media-amazon.com/images/M/MV5BZjU3ZmUzNzYtMTE4Yy00MTZhLWE1ODYtYWM2MzQyMjFjNTBhXkEyXkFqcGdeQXVyNTI4ODY2NjE@._V1_FMjpg_UX1000_.jpg"
        ),
        Actor(
            11,
            "Jackson",
            "Rathbone",
            listOf(
                ActorMovie(2, "Phil")
            ),
            "data:image/jpeg;base64,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"
        ),
        Actor(
            12,
            "Edoardo",
            "Costa",
            listOf(
                ActorMovie(2, "Manuel")
            ),
            "data:image/jpeg;base64,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"
        ),
        Actor(
            13, "Shameik", "Moore", listOf(
                ActorMovie(3, "Miles Morales/Spider-Man")
            ), "https://tr.web.img3.acsta.net/c_162_216/pictures/14/12/05/13/45/453276.jpg"
        ),
        Actor(
            14, "Hailee", "Steinfeld", listOf(
                ActorMovie(3, "Gwen Stacey/Spider-Gwen")
            ), "https://tr.web.img2.acsta.net/c_162_216/pictures/19/08/27/10/13/0826817.jpg"
        ),
        Actor(
            15,
            "Oscar",
            "Isaac",
            listOf(
                ActorMovie(3, "Miguel OHara/Spider-Man 2099"),
            ),
            "https://avatars.mds.yandex.net/i?id=1edd56c83b8709292878510693f6037025b8e399-7546740-images-thumbs&n=13"
        ),
        Actor(
            16, "Issa", "Rae", listOf(
                ActorMovie(3, "Jessica Drew/Spider-Woman")
            ), "https://tr.web.img2.acsta.net/c_162_216/pictures/16/01/27/17/54/439095.jpg"
        ),
    )

    val movies = listOf(
        Movie(
            1,
            R.string.spider_man_across_the_spider_verse_name,
            "140",
            "https://www.hdfilmcehennemi.life/uploads/poster/spider-man-across-the-spider-verse.jpg",
            "Marvel",
            "Joaquim Dos Santos",
            "Phil Lord",
            96,
            listOf(
                Categorie.Animasyon, Categorie.Aksiyon, Categorie.Macera
            ),
            R.string.spider_man_across_the_spider_verse_content,
            10,
            isViolence = true,
            isNegativeExample = true,
            1
        ),
        Movie(
            2,
            R.string.the_island_name,
            "93",
            "https://www.hdfilmcehennemi.life/uploads/poster/the-island.jpg",
            "Wowie",
            "Michael Bay",
            "Caspian Tredwell-Owen",
            77,
            listOf(
                Categorie.Aksiyon, Categorie.Gerilim
            ),
            R.string.the_island_content,
            16,
            isViolence = true,
            isNegativeExample = true,
            2
        ),
        Movie(
            3,
            R.string.saw_X_name,
            "118",
            "https://www.hdfilmcehennemi.life/uploads/poster/saw-x.jpg",
            "Wowie",
            "Kevin Greutert",
            "Josh Stolberg",
            70,
            listOf(
                Categorie.Korku, Categorie.Gerilim, Categorie.Gizem
            ),
            R.string.saw_X_content,
            18,
            isViolence = true,
            isNegativeExample = true,
            3
        ),
        Movie(
            4,
            R.string.medusa_deluxe_name,
            "101",
            "https://www.hdfilmcehennemi.life/uploads/poster/medusa-deluxe.jpg",
            "Wowie",
            "Thomas Hardiman",
            "Thomas Hardiman",
            76,
            listOf(
                Categorie.Dram, Categorie.Gizem
            ),
            R.string.medusa_deluxe_content,
            13,
            isViolence = true,
            isNegativeExample = true,
            4
        ),
        Movie(
            5,
            R.string.scream_VI_name,
            "122",
            "https://www.hdfilmcehennemi.life/uploads/poster/scream-6-2.jpg",
            "Paramount Pictures",
            "Tyler Gillett",
            "James Vanderbilt",
            76,
            listOf(
                Categorie.Korku, Categorie.Gerilim, Categorie.Gizem
            ),
            R.string.scream_VI_content,
            18,
            isViolence = true,
            isNegativeExample = true,
            2
        ),
        Movie(
            6,
            R.string.bruce_almighty_name,
            "101",
            "https://www.hdfilmcehennemi.life/uploads/poster/aman-tanrim-1-izle.jpg",
            "Spyglass Media Group",
            "Tom Shadyac",
            "Steve Koren",
            88,
            listOf(
                Categorie.Komedi, Categorie.Fantastik
            ),
            R.string.bruce_almighty_content,
            16,
            isViolence = true,
            isNegativeExample = true,
            5
        ),
        Movie(
            7,
            R.string.hidden_strike_name,
            "103",
            "https://www.hdfilmcehennemi.life/uploads/poster/hidden-strike.jpg",
            "CHANTIER FILMS",
            "Scott Waugh",
            "Arash Amel",
            80,
            listOf(
                Categorie.Aksiyon, Categorie.Macera, Categorie.Komedi
            ),
            R.string.hidden_strike_content,
            16,
            isViolence = true,
            isNegativeExample = true,
            5
        ),
        Movie(
            8,
            R.string.teenage_mutant_ninja_turtles__mutant_mayhem_name,
            "99",
            "https://www.hdfilmcehennemi.life/uploads/poster/teenage-mutant-ninja-turtles-mutant-mayhem.jpg",
            "Point Grey Pictures",
            "Jeff Rowe",
            "Brendan O'Brien",
            91,
            listOf(
                Categorie.Aksiyon, Categorie.Macera, Categorie.Animasyon
            ),
            R.string.teenage_mutant_ninja_turtles__mutant_mayhem_content,
            7,
            isViolence = true,
            isNegativeExample = true,
            5
        ),
        Movie(
            9,
            R.string.marry_my_dead_body_name,
            "130",
            "https://www.hdfilmcehennemi.life/uploads/poster/marry-my-dead-body.jpg",
            "QC Media",
            "Cheng Wei-hao",
            "Cheng Wei-hao",
            75,
            listOf(
                Categorie.Aksiyon, Categorie.Komedi, Categorie.Dram
            ),
            R.string.marry_my_dead_body_content,
            18,
            isViolence = true,
            isNegativeExample = true,
            4
        ),
        Movie(
            10,
            R.string.jesus_revolution_name,
            "120",
            "https://www.hdfilmcehennemi.life/uploads/poster/jesus-revolution.jpg",
            " Lions Gate Entertainment",
            "Jon Erwin",
            "Jon Erwin",
            71,
            listOf(Categorie.Dram),
            R.string.jesus_revolution_content,
            16,
            isViolence = true,
            isNegativeExample = true,
            3
        ),
        Movie(
            11,
            R.string.oppenheimer_name,
            "180",
            "https://www.hdfilmcehennemi.life/uploads/poster/oppenheimer.jpg",
            "Syncopy",
            "Christopher Nolan",
            "Christopher Nolan",
            94,
            listOf(
                Categorie.Dram, Categorie.Biyografi, Categorie.Tarih
            ),
            R.string.oppenheimer_content,
            13,
            isViolence = true,
            isNegativeExample = true,
            4
        ),
    )
}