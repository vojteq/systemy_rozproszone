// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensor.proto

package sensors;

public interface MeasurementsPackageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Sensors.MeasurementsPackage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Sensors.Measurement measurement = 1;</code>
   */
  java.util.List<sensors.Measurement> 
      getMeasurementList();
  /**
   * <code>repeated .Sensors.Measurement measurement = 1;</code>
   */
  sensors.Measurement getMeasurement(int index);
  /**
   * <code>repeated .Sensors.Measurement measurement = 1;</code>
   */
  int getMeasurementCount();
  /**
   * <code>repeated .Sensors.Measurement measurement = 1;</code>
   */
  java.util.List<? extends sensors.MeasurementOrBuilder> 
      getMeasurementOrBuilderList();
  /**
   * <code>repeated .Sensors.Measurement measurement = 1;</code>
   */
  sensors.MeasurementOrBuilder getMeasurementOrBuilder(
      int index);
}
