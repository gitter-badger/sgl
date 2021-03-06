package org.carangorango.sgl.core;

import java.util.Optional;

import static com.google.common.base.Preconditions.checkArgument;

public abstract class CostlySignalingGame<S, M, A> extends SignalingGame<S, M, A> {

    protected final Payoff utility(S state, Optional<M> message, A action) {
        checkArgument(message.isPresent(), "Should pass a message as argument");
        return this.utility(state, message.get(), action);
    }

    public abstract Payoff utility(S state, M message, A action);

}
