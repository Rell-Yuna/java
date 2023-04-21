package i.dont.have.any.domains.Api;

public class LimitableDouble {

    private double value;
    private final double min;
    private final double max;
    private final boolean isEnableOverflow;

    public double getValue() {
        return this.value;
    }

    public double getMin() {
        return this.min;
    }

    public double getMax() {
        return this.max;
    }

    public boolean isEnabledOverflow() {
        return this.isEnableOverflow;
    }

    public void setValue(final double value) {
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

    private LimitableDouble(final double value, final double min, final double max, final boolean isEnableOverflow) {

        this.min = min;
        this.max = max;
        this.isEnableOverflow = isEnableOverflow;

        this.setValue(value);

    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {

        private double min = Integer.MIN_VALUE;
        private double max = Integer.MAX_VALUE;
        private boolean isEnableOverflow = true;

        public Builder setMinimum(final double min) {
            this.min = min;
            return this;
        }

        public Builder setMaximum(final double max) {
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

        public LimitableDouble build(final double value) {
            return new LimitableDouble(value, min, max, isEnableOverflow);
        }

    }
}
