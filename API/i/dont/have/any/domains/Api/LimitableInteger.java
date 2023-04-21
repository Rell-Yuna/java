package i.dont.have.any.domains.Api;

public class LimitableInteger {

    private int value;
    private final int min;
    private final int max;
    private final boolean isEnableOverflow;

    public int getValue() {
        return this.value;
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

    public boolean isEnabledOverflow() {
        return this.isEnableOverflow;
    }

    public void setValue(final int value) {
        if (!(this.min <= value && value <= this.max)) {
            if (isEnableOverflow) {
                if (this.max < value) {
                    this.value = this.min + (value - this.max) % (this.max - this.min) + 2;
                    return;
                } else {
                    this.value = this.min + (value + this.max) % (this.max - this.min) + 2;
                    return;
                }
            }else{
                throw new IllegalArgumentException("オーバーフローが発生しました");
            }
        }else{
            this.value = value;
            return;
        }
    }

    private LimitableInteger(final int value, final int min, final int max, final boolean isEnableOverflow) {

        this.min = min;
        this.max = max;
        this.isEnableOverflow = isEnableOverflow;

        this.setValue(value);

    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {

        private int min = Integer.MIN_VALUE;
        private int max = Integer.MAX_VALUE;
        private boolean isEnableOverflow = true;

        public Builder setMinimum(final int min) {
            this.min = min;
            return this;
        }

        public Builder setMaximum(final int max) {
            this.max = max;
            return this;
        }

        public Builder EnableOverflow() {
            this.isEnableOverflow = true;
            return this;
        }

        public Builder DisableOverflow() {
            this.isEnableOverflow = false;
            return this;
        }

        public LimitableInteger build(final int value) {
            return new LimitableInteger(value, min, max, isEnableOverflow);
        }

    }
}
