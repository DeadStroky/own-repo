package eu.kanade.tachiyomi.extension.pt.mangalivre

import eu.kanade.tachiyomi.multisrc.madara.Madara

class MangaLivre : Madara("Manga Livre", "https://mangalivre.tv", "pt-BR") {
    override val client = network.cloudflareClient
    override val supportsLatest = true
    override val isNsfw = true
}