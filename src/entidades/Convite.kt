package entidades

// Enum com os tipos e codigos de convites aceitos.
enum class tipoConvite(val codigo: String) {
    COMUM("XT"), PREMIUM("XP"), LUXO("XL");
}

// Modelagem de Convite
data class Convite(val convite: String, val codigo: String)