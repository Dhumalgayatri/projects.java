<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace max="-2" attributes="0"/>
              <Component id="jPanel1" max="32767" attributes="0"/>
              <EmptySpace min="-2" pref="21" max="-2" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <Component id="jPanel1" min="-2" max="-2" attributes="0"/>
              <EmptySpace min="0" pref="25" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Container class="javax.swing.JPanel" name="jPanel1">
      <Properties>
        <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color blue="ff" green="cc" red="cc" type="rgb"/>
        </Property>
      </Properties>

      <Layout>
        <DimensionLayout dim="0">
          <Group type="103" groupAlignment="0" attributes="0">
              <Group type="102" attributes="0">
                  <Group type="103" groupAlignment="0" attributes="0">
                      <Group type="102" attributes="0">
                          <EmptySpace min="-2" pref="218" max="-2" attributes="0"/>
                          <Component id="jButton1" min="-2" pref="153" max="-2" attributes="0"/>
                          <EmptySpace min="-2" pref="119" max="-2" attributes="0"/>
                          <Component id="jButton2" min="-2" pref="155" max="-2" attributes="0"/>
                      </Group>
                      <Group type="102" alignment="0" attributes="0">
                          <EmptySpace min="-2" pref="79" max="-2" attributes="0"/>
                          <Component id="jScrollPane1" min="-2" pref="692" max="-2" attributes="0"/>
                      </Group>
                  </Group>
                  <EmptySpace pref="81" max="32767" attributes="0"/>
              </Group>
          </Group>
        </DimensionLayout>
        <DimensionLayout dim="1">
          <Group type="103" groupAlignment="0" attributes="0">
              <Group type="102" alignment="0" attributes="0">
                  <EmptySpace min="-2" pref="38" max="-2" attributes="0"/>
                  <Component id="jScrollPane1" min="-2" pref="279" max="-2" attributes="0"/>
                  <EmptySpace pref="58" max="32767" attributes="0"/>
                  <Group type="103" groupAlignment="3" attributes="0">
                      <Component id="jButton2" alignment="3" min="-2" pref="42" max="-2" attributes="0"/>
                      <Component id="jButton1" alignment="3" min="-2" pref="42" max="-2" attributes="0"/>
                  </Group>
                  <EmptySpace min="-2" pref="38" max="-2" attributes="0"/>
              </Group>
          </Group>
        </DimensionLayout>
      </Layout>
      <SubComponents>
        <Container class="javax.swing.JScrollPane" name="jScrollPane1">
          <AuxValues>
            <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
          </AuxValues>

          <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
          <SubComponents>
            <Component class="javax.swing.JTextArea" name="txtarea">
              <Properties>
                <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="ff" green="cc" red="ff" type="rgb"/>
                </Property>
                <Property name="columns" type="int" value="20"/>
                <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                  <Font name="Arial" size="18" style="1"/>
                </Property>
                <Property name="rows" type="int" value="5"/>
              </Properties>
            </Component>
          </SubComponents>
        </Container>
        <Component class="javax.swing.JButton" name="jButton1">
          <Properties>
            <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
              <Font name="Arial" size="18" style="1"/>
            </Property>
            <Property name="text" type="java.lang.String" value="Back"/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jButton1ActionPerformed"/>
          </Events>
        </Component>
        <Component class="javax.swing.JButton" name="jButton2">
          <Properties>
            <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
              <Font name="Tahoma" size="18" style="1"/>
            </Property>
            <Property name="text" type="java.lang.String" value="Clear"/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jButton2ActionPerformed"/>
          </Events>
        </Component>
      </SubComponents>
    </Container>
  </SubComponents>
</Form>