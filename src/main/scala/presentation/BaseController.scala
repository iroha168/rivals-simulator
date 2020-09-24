package presentation

import domain.deck.Deck
import domain.gamestatus.GameStatus

trait BaseController {
  def generateRandomDeck(): GameStatus

}
