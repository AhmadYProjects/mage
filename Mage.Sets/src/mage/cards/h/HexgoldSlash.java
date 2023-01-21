package mage.cards.h;

import java.util.UUID;

import mage.abilities.Ability;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.dynamicvalue.IntPlusDynamicValue;
import mage.abilities.dynamicvalue.common.ManacostVariableValue;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.keyword.InfectAbility;
import mage.abilities.keyword.ToxicAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author AhmadYProjects
 */
public final class HexgoldSlash extends CardImpl {

    public HexgoldSlash(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{R}");
        

        // Hexgold Slash deals 2 damage to target creature. If that creature has toxic, Hexgold Slash deals 4 damage to that creature instead.
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
        this.getSpellAbility().addEffect(new HexgoldSlashEffect());
    }

    private HexgoldSlash(final HexgoldSlash card) {
        super(card);
    }

    @Override
    public HexgoldSlash copy() {
        return new HexgoldSlash(this);
    }
}

class HexgoldSlashEffect extends OneShotEffect{
    public HexgoldSlashEffect(){
        super(Outcome.Damage);
        staticText = "{this} deals 2 damage to target creature. If that creature has toxic, {this} deals 4 damage instead}";
    }

    public HexgoldSlashEffect(final HexgoldSlashEffect effect){
        super(effect);
    }

    @Override
    public HexgoldSlashEffect copy(){
        return new HexgoldSlashEffect();
    }

    @Override
    public boolean apply(Game game, Ability source){
        Permanent permanent = game.getPermanent(getTargetPointer().getFirst(game, source));
        if (permanent != null){
            if (permanent.getAbilities().(ToxicAbility.getInstance())) {
                permanent.damage(2,source,game);
            }
            else{
                permanent.damage(2,source,game);
            }
            return true;
        }
        return false;
    }
}
