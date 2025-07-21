package eu.kanade.tachiyomi.extension.pt.mangalivre

import eu.kanade.tachiyomi.multisrc.madara.MadaraFactory

class MangaLivreFactory : MadaraFactory(
    "Manga Livre",
    "https://mangalivre.tv",
    "pt-BR",
    MangaLivre::class,
)