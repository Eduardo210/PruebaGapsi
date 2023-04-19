package mx.com.pruebagapsi.IU.Complements

import android.content.SearchRecentSuggestionsProvider

class ExpenseSuggestionsProvider : SearchRecentSuggestionsProvider() {

    init {
        setupSuggestions(AUTHORITY, MODE)
    }

    companion object {
        const val AUTHORITY = "com.develou.ExpenseSuggestionsProvider"
        const val MODE: Int = DATABASE_MODE_QUERIES or DATABASE_MODE_2LINES
    }
}